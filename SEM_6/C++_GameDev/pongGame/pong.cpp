#include <SFML/Graphics.hpp>
#include "Bat.h"
#include "Ball.h"
#include <sstream>
#include <iostream>

using namespace sf;

int main() {
    VideoMode vm(960, 540);
    RenderWindow window(vm, "PONG");
    View view(FloatRect(0, 0, 1920, 1080));
    window.setView(view);

    Bat bat(1920 / 2 - 250 / 2, 1080 - 80);
    Ball ball(1920 / 2 - 25, 0);

    Clock clock;
    int score = 0;
    int lives = 3;
    bool isPaused = false;
    bool isGameOver = false;

    // HUD
    Text hud;
    Font font;
    font.loadFromFile("font/KOMIKAP_.ttf");
    hud.setFont(font);
    hud.setCharacterSize(60);
    hud.setFillColor(Color::Red);
    hud.setPosition(40, 40);

    // Pause Message
    Text pauseText;
    pauseText.setFont(font);
    pauseText.setCharacterSize(100);
    pauseText.setFillColor(Color::Red);
    pauseText.setString("PAUSED");
    FloatRect pauseBounds = pauseText.getLocalBounds();
    pauseText.setOrigin(pauseBounds.width / 2, pauseBounds.height / 2);
    pauseText.setPosition(1920 / 2, 1080 / 2);

    // Game Over Message
    Text gameOverText;
    gameOverText.setFont(font);
    gameOverText.setCharacterSize(100);
    gameOverText.setFillColor(Color::Red);
    gameOverText.setString("GAME OVER!");
    FloatRect gameOverBounds = gameOverText.getLocalBounds();
    gameOverText.setOrigin(gameOverBounds.width / 2, gameOverBounds.height / 2);
    gameOverText.setPosition(1920 / 2, 1080 / 2);

    while (window.isOpen()) {
        Event event;
        while (window.pollEvent(event)) {
            if (event.type == Event::Closed) {
                window.close();
            }

            // Toggle pause
            if (event.type == Event::KeyPressed && event.key.code == Keyboard::Space && !isGameOver) {
                isPaused = !isPaused;
            }
        }

        if (Keyboard::isKeyPressed(Keyboard::Escape)) {
            window.close();
        }

        if (!isPaused && !isGameOver) {
            // Bat control
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

            // Ball physics
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
                    isGameOver = true;
                    isPaused = true;
                }
            }

            // Update
            Time dt = clock.restart();
            bat.update(dt);
            ball.update(dt);
        } else {
            // Keep clock in sync while paused/game over
            clock.restart();
        }

        // HUD update
        std::stringstream ss;
        ss << "Score: " << score << "\nLives: " << lives;
        hud.setString(ss.str());

        // Rendering
        window.clear();
        window.draw(bat.getShape());
        window.draw(ball.getShape());
        window.draw(hud);

        if (isPaused && !isGameOver) {
            window.draw(pauseText);
        }

        if (isGameOver) {
            window.draw(gameOverText);
        }

        window.display();
    }

    return 0;
}

