#include <iostream>
#include <string>
#include <sstream>
#include "item.h"

    Item::Item(int price, std::string name)
    : _price{price}, _name{name} {
    if(price < 0) throw std::runtime_error("Invalid price!");
    }

    std::string Item::to_string()
    {
        std::stringstream nameprice;
        nameprice << _name << " ($" << _price << ")";
        return nameprice.str();
    }