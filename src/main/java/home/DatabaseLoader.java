package home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner{

    private final PointsRepository pointsRepository;

    @Autowired
    public DatabaseLoader(PointsRepository pointsRepository) {
        this.pointsRepository = pointsRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.pointsRepository.save(new Point(45.322, 34.3345));
        this.pointsRepository.save(new Point(15.322, 44.3345));
    }
}