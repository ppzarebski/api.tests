package services.petstore.model;

import java.util.List;

public class PetModel {
    public Integer id;
    public Entity category;
    public String name;
    public List<String> photoUrls;
    public List<Entity> tags;
    public String status;

    public static class Entity {
        public Integer id;
        public String name;

        public Entity() {}

        public Entity(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
