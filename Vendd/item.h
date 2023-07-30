#ifndef _ITEM_H
#define _ITEM_H
#include <string>

class Item
{
    public:
        Item(int price, std::string name);
        std::string to_string();

    private:
        int _price;
        std::string _name;

};
#endif
