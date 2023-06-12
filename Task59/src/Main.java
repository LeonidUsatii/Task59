public class Main {
    /*
    Представим, что мы создаем программу для салона красоты.
Создайте класс Client с полями:
- String name;
- boolean hasHaircut;  (true == подстрижен)

Создайте класс BeautySalon - салон красоты - с полями:
- Deque<Client> clientsQueue; - очередь клиентов.
- String title - название салона.

И методами:
- записать клиента на стрижку в порядке живой очереди - register(Client client)
- постричь следующего по очереди клиента - void treatNextClient();  - метод без параметров!
Метод должен выводить в консоль фразу "<Имя клиента> пострижен" и менять значение поля hasHaircut на true.

Дополнительно:
- сделайте ограничение по вместимости салона.
- сделайте отдельную очередь на маникюр и соответствующие методы.
- (ограничение на вместимость можно сделать общим для этих очередей, например, не больше 20
человек в обеих очередях)
     */
    public static void main(String[] args) {

        BeautySalon salon = new BeautySalon("Beauty");

        salon.register(new Client("Name1"));
        salon.register(new Client("Name2"));

        System.out.println(salon.getClientsQueue());

        salon.treatNextClient();

        System.out.println(salon.getClientsQueue());

        salon.treatNextClient();

        System.out.println(salon.getClientsQueue());

        salon.treatNextClient();

        salon.registerManicure(new Client("Name3"));
        salon.registerManicure(new Client("Name4"));

        salon.treatNextClientManicure();

    }
}