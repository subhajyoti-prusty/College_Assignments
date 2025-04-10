#include <SFML/Graphics.hpp>
#include "Bat.h"  // Make sure Bat.h and Bat.cpp are implemented properly
#include "Ball.h" // Make sure Ball.h and Ball.cpp are implemented properly
#include <sstream>
#include <iostream>

using namespace sf;

int main() {
    VideoMode vm(960, 540);
    RenderWindow window(vm, "PONG");
    View view(FloatRect(0, 0, 1920, 1080));
    window.setView(view);

    Bat bat(1920 / 2 - 250 / 2, 1080 - 80);  // Bat positioned at the bottom of the window
    Ball ball(1920 / 2 - 25, 0);  // Ball positioned at the top of the window

    Clock clock;
    int score = 0;
    int lives = 3;
    bool isPaused = false;  // Game is initially not paused

    // Create the HUD (score and lives)
    Text hud;
    Font font;
    font.loadFromFile("font/KOMIKAP_.ttf");
    hud.setFont(font);
    hud.setCharacterSize(60);
    hud.setFillColor(Color::Red);
    hud.setPosition(40, 40);

    // Message when game over or paused
    Text msg;
    msg.setFont(font);
    msg.setCharacterSize(80);
    msg.setFillColor(Color::Red);
    msg.setPosition(100, 100);

    // Gaming Loop
    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed) {
                window.close();
            }

            // Toggle pause when spacebar is pressed
            if (event.type == Event::KeyPressed && event.key.code == Keyboard::Space) {
                isPaused = !isPaused;  // Toggle pause state
            }
        }

        if (Keyboard::isKeyPressed(Keyboard::Escape)) {
            window.close();
        }

        if (!isPaused) {  // Only update the game when not paused
            // Handle player movement
            if (Keyboard::isKeyPressed(Keyboard::Right)) {
                bat.moveRight();
            } else {
                bat.stopRight();
            }

            if (Keyboard::isKeyPressed(Keyboard::Left)) {
                bat.moveLeft();
            } else {
                bat.stopLeft();
            }

            // Handle ball movement and rebound logic
            if ((ball.getPosition().left < 0) || (ball.getPosition().left + ball.getPosition().width > 1920)) {
                ball.reboundSides();
            }

            if (ball.getPosition().intersects(bat.getPosition())) {
                ball.reboundBatorTop();
            }

            if (ball.getPosition().top < 0) {
                ball.reboundBatorTop();
                score++;
            }

            if (ball.getPosition().top + ball.getPosition().height > 1080) {
                ball.reboundBottom();
                lives--;
                if (lives < 1) {
                    std::stringstream ss;
                    ss << "Game Over!";
                    msg.setString(ss.str());
                    score = 0;
                    lives = 3;
                }
            }

            // Update game objects
            Time dt = clock.restart();
            bat.update(dt);
            ball.update(dt);
        }

        // Display Paused text if the game is paused
        if (isPaused) {
            Text pausedText;
            pausedText.setFont(font);
            pausedText.setCharacterSize(75);
            pausedText.setFillColor(Color::Red);
            pausedText.setString("PAUSED");
            window.draw(pausedText);
        }

        // Update HUD text with score and lives
        std::stringstream ss;
        ss << "Score: " << score << "\nLives: " << lives;
        hud.setString(ss.str());

        // Clear window and draw everything
        window.clear();
        window.draw(bat.getShape());
        window.draw(ball.getShape());
        window.draw(hud);
        window.draw(msg);

        window.display();
    }

    return 0;
}

