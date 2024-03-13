package in.vishal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.vishal.projection.NameAgeProjection;
import in.vishal.repo.PersonRepo;

import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final PersonRepo personRepo;

    public MyCommandLineRunner(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        List<NameAgeProjection> people = personRepo.findNameAge();

        people.forEach(person -> {
            String name = person.getName();
            int age = person.getAge();
            System.out.println("Name: " + name + ", Age: " + age);
        });
    }
}