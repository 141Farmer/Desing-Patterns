import java.util.concurrent.atomic.AtomicInteger;

public class FactoryChair implements Factory {

        private static volatile FactoryChair instance;
        private final AtomicInteger idCounter = new AtomicInteger(0);

        public static FactoryChair getInstance() {
            if (instance == null) {
                synchronized (FactoryChair.class) {
                    if (instance == null) {
                        instance = new FactoryChair();
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
            ModernChair chair = new ModernChair();
            chair.setId(generateUniqueId());
            return chair;
        }

        @Override
        public VictorianFurniture createVictorianFurniture() {
            VictorianCHair chair = new VictorianCHair();
            chair.setId(generateUniqueId());
            return chair;
        }
}