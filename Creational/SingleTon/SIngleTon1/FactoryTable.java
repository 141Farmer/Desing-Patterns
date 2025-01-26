import java.util.concurrent.atomic.AtomicInteger;

public class FactoryTable implements Factory {

        private static volatile FactoryTable instance;
        private final AtomicInteger idCounter = new AtomicInteger(0);

        public static FactoryTable getInstance() {
            if (instance == null) {
                synchronized (FactoryChair.class) {
                    if (instance == null) {
                        instance = new FactoryTable();
                    }
                }
            }
            return instance;
        }

        public int generateUniqueId() {
            return idCounter.incrementAndGet();
        }

        @Override
        public ModernFurniture createModernFurniture() {
            ModernTable chair = new ModernTable();
            chair.setId(generateUniqueId());
            return chair;
        }

        @Override
        public VictorianFurniture createVictorianFurniture() {
            VictorianTable chair = new VictorianTable();
            chair.setId(generateUniqueId());
            return chair;
        }
}