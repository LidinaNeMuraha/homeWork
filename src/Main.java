public class Main {
    public static void main(String[] args) {

        // zadanie 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // zadanie 2

        var dogPlus = dog + 4;
        var catPlus = cat + 4;
        var paperPlus = paper + 4;

        System.out.println(dogPlus);
        System.out.println(catPlus);
        System.out.println(paperPlus);

        // zadanie 3

        var DogMinus = dog - 3.5;
        var CatMinus = cat - 1.6;
        var PaperMinus = paper - 7639;

        System.out.println(DogMinus);
        System.out.println(CatMinus);
        System.out.println(PaperMinus);

        // zadanie 4

        var friend = 19;
        System.out.println(friend);
        var friends = friend + 2;
        System.out.println(friends);
        var friendss = friends / 7;
        System.out.println(friendss);

        // zadanie 5

        var frog = 3.5;
        System.out.println(frog);
        var frogg = frog * 10;
        System.out.println(frogg);
        var froggg = frogg / 3.5;
        System.out.println(froggg);
        var frogggg = froggg + 4;
        System.out.println(frogggg);

        // zadanie 6

        var bokserOdin = 78.2;
        var bokserDva = 82.7;

        var massaObsh = bokserOdin + bokserDva;
        System.out.println(massaObsh);

        var raznica = bokserDva - bokserOdin;
        System.out.println("1 боксер легче второго на " + raznica + " кг!");

        // zadanie 7

        var bolshe =12;
        var menshe = 3;

        var obsh = bolshe + menshe + 10;
        var delenie = (bolshe + menshe) % obsh;
        System.out.println(delenie);

        // zadanie 8

        var time = 640;
        var workTime = 8;

        var workers = time / workTime;
        System.out.println("Всего работников в компании " + workers + " человек");

        var workersDop = workers + 94;
        var timePosle = workersDop * workTime;
        System.out.println("Если в компании работает " + workersDop+ " человек, то всего " + timePosle + " часов работы может быть поделено между сотрдникками");








    }


}