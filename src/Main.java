public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 6");
        var boxerWeightOne = 78.2;
        var boxerWeightTwo = 82.7;
        var totalWeight = boxerWeightOne + boxerWeightTwo;
        System.out.println("Общий вес бойцов "+totalWeight+" кг!");
        var differenceWeight = boxerWeightTwo - boxerWeightOne;
        System.out.println("Весовая разница между бойцами "+differenceWeight+" кг!");

        System.out.println("Задание 7");
        // способ 1-ый
        differenceWeight = boxerWeightTwo - boxerWeightOne;
        System.out.println("1-ый способ: Весовая разница между бойцами "+differenceWeight+" кг!");
        // способ 2
        var balanceWeight = boxerWeightTwo % boxerWeightOne;
        System.out.println("2-ой способ: Весовая разница между бойцами "+balanceWeight+" кг!");

        System.out.println("Задание 8");
        // Первая часть
        var totalTime = 640;
        var workingHours = 8;
        var totalEmployee = totalTime / workingHours;
        System.out.println("Всего работников в компании " +totalEmployee+ " человек.");
        // Вторая часть
        totalEmployee = totalEmployee + 94;
        totalTime = totalEmployee * workingHours;
        System.out.println("Если в компании работает " +totalEmployee+ " человека, то всего "+totalTime+ " часа работы может быть поделено между сотрудниками.");
    }
}