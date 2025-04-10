#include <SFML/Graphics.hpp>
#include <ctime> 

int main()
{
    sf::RenderWindow window(sf::VideoMode(960, 540), "SFML Rectangle");

    float width = 200.f;
    float height = 100.f;

    sf::RectangleShape redRectangle(sf::Vector2f(width, height));
    redRectangle.setFillColor(sf::Color::Red);

    float posX = 0.f;
    float posY = (540.f - height) / 2.f;
    float rectangleSpeed = 0.f; 
    bool rectangleActive = false; 

    sf::Clock clock; 

    // Initialize random seed
    srand((int)time(0));

    while (window.isOpen())
    {
        sf::Event event;
        while (window.pollEvent(event))
        {
            if (event.type == sf::Event::Closed)
                window.close();
        }

        if (!rectangleActive)
        {
            rectangleSpeed = (rand() % 200) + 200; 
            posX = 0.f;
            rectangleActive = true;
        }
        else
        {
            sf::Time dt = clock.restart();
            posX += rectangleSpeed * dt.asSeconds();
            
            if (posX + width >= 960.f)
            {
                posX = 960.f - width; 
                rectangleSpeed = -rectangleSpeed; 
            }
            else if (posX <= 0.f)
            {
                posX = 0.f;
                rectangleSpeed = -rectangleSpeed;
            }
        }

        redRectangle.setPosition(posX, posY);

        window.clear(sf::Color::Black);
        window.draw(redRectangle);
        window.display();
    }
    
    return 0;
}

