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
        this.pointsRepository.save(new Point(48.322, 2.3345));
        this.pointsRepository.save(new Point(48.321, 2.33455));
    }
}