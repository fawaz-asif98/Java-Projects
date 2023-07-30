#include <iostream>
#include "vending_machine.h"
#include "item.h"

int main()
{
    Vending_Machine vendmach;
    std::cout << "Welcome to the Vending Machine\n";
    vendmach.add("Sprite", 3.99);
    vendmach.add("Water", 2.99);
    std::cout << vendmach.menu() << std::endl;
    vendmach.buy(1);
    return 0;
}

