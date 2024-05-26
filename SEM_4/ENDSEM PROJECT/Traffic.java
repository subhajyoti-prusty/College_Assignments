import java.util.ArrayList;
import java.util.List;

class Traffic {
    //Road Types
    enum RoadType {
        VEHICLE, CYCLIST, PEDESTRIAN
    }

    //Road
    abstract class Road {
        private RoadType roadType;
        private String name;
        
        public Road(RoadType roadType, String name) {
            this.roadType = roadType;
            this.name = name;
        }

        public RoadType getRoadType() {
            return roadType;
        }

        public String getName() {
            return name;
        }

        public abstract boolean canUse(User user);
    }

    //vehicle roads
    class VehicleRoad extends Road {
        public VehicleRoad(String name) {
            super(RoadType.VEHICLE, name);
        }

        @Override
        public boolean canUse(User user) {
            return user instanceof Vehicle;
        }
    }

    //vehicles
    class Vehicle extends User {
        public Vehicle(String name) {
            super(name);
        }

        @Override
        public RoadType getAllowedRoadType() {
            return RoadType.VEHICLE;
        }
    }

    //cyclist roads
    class CyclistRoad extends Road {
        public CyclistRoad(String name) {
            super(RoadType.CYCLIST, name);
        }

        @Override
        public boolean canUse(User user) {
            return user instanceof Cyclist;
        }
    }

    //cyclists
    class Cyclist extends User {
        public Cyclist(String name) {
            super(name);
        }

        @Override
        public RoadType getAllowedRoadType() {
            return RoadType.CYCLIST;
        }
    }

    //pedestrian roads
    class PedestrianRoad extends Road {
        public PedestrianRoad(String name) {
            super(RoadType.PEDESTRIAN, name);
        }

        @Override
        public boolean canUse(User user) {
            return user instanceof Pedestrian;
        }
    }

    //pedestrians
    class Pedestrian extends User {
        public Pedestrian(String name) {
            super(name);
        }

        @Override
        public RoadType getAllowedRoadType() {
            return RoadType.PEDESTRIAN;
        }
    }

    //User class
    abstract class User {
        private String name;
        
        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract RoadType getAllowedRoadType();
    }
    
    private List<Road> roads;

    public Traffic() {
        roads = new ArrayList<>();
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public boolean canUserUseRoad(User user, String roadName) {
        for (Road road : roads) {
            if (road.getName().equals(roadName)) {
                return road.canUse(user);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        traffic.addRoad(traffic.new VehicleRoad("Main Street"));
        traffic.addRoad(traffic.new CyclistRoad("Bike Lane 1"));
        traffic.addRoad(traffic.new PedestrianRoad("Walkway 1"));

        User car = traffic.new Vehicle("Car 1");
        User cyclist = traffic.new Cyclist("Cyclist 1");
        User pedestrian = traffic.new Pedestrian("Pedestrian 1");

        System.out.println("Car can use Main Street: " + traffic.canUserUseRoad(car, "Main Street"));
        System.out.println("Cyclist can use Bike Lane 1: " + traffic.canUserUseRoad(cyclist, "Bike Lane 1"));
        System.out.println("Pedestrian can use Walkway 1: " + traffic.canUserUseRoad(pedestrian, "Walkway 1"));
        System.out.println("Car can use Bike Lane 1: " + traffic.canUserUseRoad(car, "Bike Lane 1"));
        System.out.println("Cyclist can use Walkway 1: " + traffic.canUserUseRoad(cyclist, "Walkway 1"));
    }
}
