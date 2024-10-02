import java.util.Scanner;

public class Main {
    public static void main(String[] attrs) {
        Human john = new Human("John");
        Dog dog = new Dog();
        Snake snake = new Snake();
        Hat hat = new Hat();
        Shirt shirt = new Shirt();
        Boots boots = new Boots();
        System.out.println("Enter your name:\n");
        Scanner sc = new Scanner(System.in);
        Human user = new Human(sc.nextLine());
        while(true) {
            System.out.println("Make interaction with:\n");
            System.out.println(user.name + " " + john.name + " " + dog.name + " " + snake.name + " " + hat.name + " " + shirt.name + " " + boots.name + "\n");
            String choice = sc.nextLine();

            if(choice.equals(user.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Greetings 2.Wear 3.Check\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println(user.makeSound());
                }
                else if (choice2.equals("2")) {
                    System.out.println("Choose clothes:\n");
                    System.out.println(hat.name + " " + shirt.name + " " + boots.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(hat.name)) {
                        user.putOn(hat);
                        System.out.println(user.checkHead());
                    }
                    else if (choice2.equals(shirt.name)) {
                        user.putOn(shirt);
                        System.out.println(user.checkTorso());
                    }
                    else if (choice2.equals(boots.name)) {
                        user.putOn(boots);
                        System.out.println(user.checkFeet());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("3")) {
                    System.out.println(user.cloathesCheck());
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(john.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Greetings 2.Wear 3.Check\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println(john.makeSound());
                }
                else if (choice2.equals("2")) {
                    System.out.println("Choose clothes:\n");
                    System.out.println(hat.name + " " + shirt.name + " " + boots.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(hat.name)) {
                        john.putOn(hat);
                        System.out.println(john.checkHead());
                    }
                    else if (choice2.equals(shirt.name)) {
                        john.putOn(shirt);
                        System.out.println(john.checkTorso());
                    }
                    else if (choice2.equals(boots.name)) {
                        john.putOn(boots);
                        System.out.println(john.checkFeet());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("3")) {
                    System.out.println(john.cloathesCheck());
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(dog.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Greetings 2.Wear 3.Check 4.Give name 5.Tame\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println(dog.makeSound());
                }
                else if (choice2.equals("2")) {
                    System.out.println("Choose clothes:\n");
                    System.out.println(hat.name + " " + shirt.name + " " + boots.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(hat.name)) {
                        dog.putOn(hat);
                        System.out.println(dog.checkHead());
                    }
                    else if (choice2.equals(shirt.name)) {
                        dog.putOn(shirt);
                        System.out.println(dog.checkTorso());
                    }
                    else if (choice2.equals(boots.name)) {
                        dog.putOn(boots);
                        System.out.println(dog.checkFeet());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("3")) {
                    System.out.println(dog.cloathesCheck());
                }
                else if (choice2.equals("4")) {
                    choice2 = sc.nextLine();
                    dog.giveName(choice2);
                }
                else if (choice2.equals("5")) {
                    dog.tame();
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(snake.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Greetings 2.Wear 3.Check\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println(snake.makeSound());
                }
                else if (choice2.equals("2")) {
                    System.out.println("Choose clothes:\n");
                    System.out.println(hat.name + " " + shirt.name + " " + boots.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(hat.name)) {
                        snake.putOn(hat);
                        System.out.println(snake.checkHead());
                    }
                    else if (choice2.equals(shirt.name)) {
                        snake.putOn(shirt);
                        System.out.println(snake.checkTorso());
                    }
                    else if (choice2.equals(boots.name)) {
                        snake.putOn(boots);
                        System.out.println(snake.checkFeet());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("3")) {
                    System.out.println(snake.cloathesCheck());
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(hat.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Equip 2.User\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println("Choose user:\n");
                    System.out.println(user.name + " " + john.name + " " + dog.name + " " + snake.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(user.name)) {
                        user.putOn(hat);
                        System.out.println(user.checkHead());
                    }
                    else if (choice2.equals(john.name)) {
                        john.putOn(hat);
                        System.out.println(john.checkHead());
                    }
                    else if (choice2.equals(dog.name)) {
                        dog.putOn(hat);
                        System.out.println(dog.checkHead());
                    }
                    else if (choice2.equals(snake.name)) {
                        snake.putOn(hat);
                        System.out.println(snake.checkHead());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("2")) {
                    System.out.println(hat.getUser());
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(shirt.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Equip 2.User 3.Iron\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println("Choose user:\n");
                    System.out.println(user.name + " " + john.name + " " + dog.name + " " + snake.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(user.name)) {
                        user.putOn(shirt);
                        System.out.println(user.checkTorso());
                    }
                    else if (choice2.equals(john.name)) {
                        john.putOn(shirt);
                        System.out.println(john.checkTorso());
                    }
                    else if (choice2.equals(dog.name)) {
                        dog.putOn(shirt);
                        System.out.println(dog.checkTorso());
                    }
                    else if (choice2.equals(snake.name)) {
                        snake.putOn(shirt);
                        System.out.println(snake.checkTorso());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("2")) {
                    System.out.println(shirt.getUser());
                }
                else if (choice2.equals("3")) {
                    shirt.ironing();
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else if(choice.equals(boots.name)) {
                System.out.println("Choose actions:\n");
                System.out.println("1.Equip 2.User\n");
                String choice2 = sc.nextLine();
                if(choice2.equals("1")) {
                    System.out.println("Choose user:\n");
                    System.out.println(user.name + " " + john.name + " " + dog.name + " " + snake.name + "\n");
                    choice2 = sc.nextLine();
                    if(choice2.equals(user.name)) {
                        user.putOn(boots);
                        System.out.println(user.checkFeet());
                    }
                    else if (choice2.equals(john.name)) {
                        john.putOn(boots);
                        System.out.println(john.checkFeet());
                    }
                    else if (choice2.equals(dog.name)) {
                        dog.putOn(boots);
                        System.out.println(dog.checkFeet());
                    }
                    else if (choice2.equals(snake.name)) {
                        snake.putOn(boots);
                        System.out.println(snake.checkFeet());
                    }
                    else {
                        System.out.println("Unknown!");
                    }
                }
                else if (choice2.equals("2")) {
                    System.out.println(boots.getUser());
                }
                else {
                    System.out.println("Unknown!");
                }
            }
            else {
                System.out.println("Unknown!");
            }
        }
    }
}
