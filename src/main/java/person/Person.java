package person;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
public class Person implements Perform {
    private Long id;
    private String name;
    private String surname;
    private Adress adress;
    private Departament departament;

    private Person() {
    }

    public static Person getInstance() {
        return new Person();
    }

    @Override
    public void getAllFlats() {
        adress.getFlats().forEach(System.out::println);
    }

    @Override
    public void perform() {
        System.out.println(id + " " + name + " " + surname+"\nAddress is: "+ adress.getCity()+" "+adress.getStreate());
    }

}
