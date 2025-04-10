#include <SFML/Graphics.hpp>
using namespace sf;

int main()
{
    VideoMode vm(1920, 1080);
    RenderWindow window(vm, "Q3", Style::Fullscreen);
    View view(FloatRect(0, 0, 1920, 1080));
    window.setView(view);

    // Create 5 circles
    CircleShape circle[5];
    for (int i = 0; i < 5; i++)
    {
        circle[i].setRadius(20);
        if (i == 4)
        {
            circle[i].setFillColor(Color::Red);
        }
        else
        {
            circle[i].setFillColor(Color::Green); 
        }
    }

    // Set positions for circles
    circle[0].setPosition(0, 10);              
    circle[1].setPosition(1820, 10);               
    circle[2].setPosition(0, 1020);                
    circle[3].setPosition(1820, 1020);                
    circle[4].setPosition(960 - 50, 540 - 50);        

    while (window.isOpen())
    {
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
            {
                window.close();
            }
        }

        // Close window with Escape key
        if (Keyboard::isKeyPressed(Keyboard::Escape))
        {
            window.close();
        }

        window.clear();
        // Draw all circles
        for (int i = 0; i < 5; i++)
        {
            window.draw(circle[i]);
        }
        window.display();
    }
    return 0;
}

