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
        this.pointsRepository.save(new Point(27.987853, 86.925028, "Mount Everest"));
        this.pointsRepository.save(new Point(-32.653165, -70.010860, "Aconcagua"));
        this.pointsRepository.save(new Point(63.069265, -151.006984, "Denali"));
        this.pointsRepository.save(new Point(-3.067210, 37.355670, "Kilimanjaro"));
        this.pointsRepository.save(new Point(45.832624, 6.865175, "Mont Blanc"));
        this.pointsRepository.save(new Point(-36.455875, 148.263618, "Mount Kosciuszko"));
        this.pointsRepository.save(new Point(-78.634063, -85.213488, "Vinson Massif"));
    }
}