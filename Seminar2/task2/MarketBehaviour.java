package Seminar2.task2;

import Seminar2.task1.Human;


public interface MarketBehaviour {

    void acceptToMarket(Human actor);  // добавляем в человека в магазин
    void releaseFromMarket(Human actor);   // Удаляем из магазина человека 
    void update();

}
