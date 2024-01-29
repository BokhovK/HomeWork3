public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
                System.out.println("Home Work 3");
                //Задание 1
                int cat = 23;
                byte rat = 2;
                short track = 32;
                long way = 222;
                float water = 22.2f;
                double coffee = 332.32;
                System.out.println("Значение переменной cat с типом int равно 23");
                System.out.println("Значение переменной rat с типом byte равно 2");
                System.out.println("Значение переменной track с типом short равно 32");
                System.out.println("Значение переменной long с типом way равно 222");
                System.out.println("Значение переменной float с типом water равно 22.2f");
                System.out.println("Значение переменной double с типом coffee равно 332.32");
                // Задание 2
                float b = 27.12f;
                long z = 987678965549L;
                double d = 2.786;
                short i = 569;
                int n = -159;
                int m = 27897;
                byte s = 67;
                //Задача 3
                byte l = 23;
                byte a = 27;
                byte e = 30;
                short paper = 430;
                int teen = l + e + a;
                long teenPaper = paper / teen;
                System.out.println("На каждого ученика рассчитано " + teenPaper + " листов бумаги");
                //Задача 4
                byte base = 2;
                byte bottle = 16;
                int baseOne = bottle / base;
                int first = baseOne * 20;
                int oneDay = 60 * 24;
                int second = oneDay * baseOne;
                int thirty = (oneDay * 3) * baseOne;
                int month = (oneDay * 31) * baseOne;
                System.out.println("За 20 мминут машина произвела " + first + " штук бутылок");
                System.out.println("За сутки машина произвела " + second + "  штук бутылок");
                System.out.println("За 3 дня машина произвела " + thirty + " штук бутылок");
                System.out.println("За месяц машина произвела " + month + " штук бутылок");
                //Задача 5
                byte colorBacket = 120;
                byte whiteColor = 2;
                byte brownColor = 4;
                int classRoom = colorBacket / (whiteColor + brownColor);
                int allWhite=classRoom*whiteColor;
                int allBrown=classRoom*brownColor;
                System.out.println("В школе, где "+classRoom+" классов, нужно "+allWhite+" банок белой краски и "+allBrown+" банок коричневой краски");
                //Задача 6
                double fiveBanana=5*80.0;
                double twoMilk=2*105.0;
                double iceCream=2*100.0;
                double egg=4*70.0;
                double allWeight=fiveBanana+twoMilk+iceCream+egg;
                double oneKg=1000.0;
                double allKg=allWeight/oneKg;
                System.out.println("Вес в граммах равен "+allWeight+" ,а вес в килограммах равен "+allKg);
                //Задача 7
                double gramm=7000.0;
                double oneSituation=gramm/250.0;
                double twoSituation=gramm/500.0;
                double mediumDay=(oneSituation+twoSituation)/2;

                System.out.println("Если спортсмен худеет на 250 грамм в 1 день, то ему нужно "+oneSituation+" дней" );
                System.out.println("Если спортсмен худеет на 500 грамм в 1 день, то ему нужно "+twoSituation+" дней" );
                System.out.println("В среднем спорстмену нужно "+mediumDay+" дней, чтоб похудеть");
                //Задача 8
                double firstWoman=67760.0;
                double secondWoman=83690.0;
                double thirtyWoman=76230.0;
                double percent=10*3/100.0;
                double finFirstWoman=firstWoman*percent;
                double finSecondWoman=secondWoman*percent;
                double finThirtyWoman=thirtyWoman*percent;
                double finalFirst=firstWoman+finFirstWoman;
                double finalSecond=secondWoman+finSecondWoman;
                double finalThirty=thirtyWoman+finThirtyWoman;
                double diffFirst=finalFirst-firstWoman;
                double diffSecond=finalSecond-secondWoman;
                double diffThirty=finalThirty-thirtyWoman;
                System.out.println("Маша теперь получает "+finalFirst+" рублей. Годовой доход вырос на "+diffFirst+" рублей");
                System.out.println("Денис теперь получает "+finalSecond+" рублей. Годовой доход вырос на "+diffSecond+" рублей");
                System.out.println("Кристина теперь получает "+finalThirty+" рублей. Годовой доход вырос на "+diffThirty+" рублей");


    }
}