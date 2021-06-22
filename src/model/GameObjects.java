package model;

import java.util.HashSet;
import java.util.Set;

public class GameObjects {

        private Set<Wall> walls;
        private Set<Box> boxes;
        private Set<Home> homes;
        private Player player;

        public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player){

            this.walls = walls;
            this.boxes = boxes;
            this.homes = homes;
            this.player = player;
        }

        public Set<GameObject> getAll(){
            Set<GameObject> gameObjectSet = new HashSet<>();
            for (Wall w : walls){
                gameObjectSet.add(w);
            }
            for (Box b : boxes){
                gameObjectSet.add(b);
            }
            for (Home h : homes){
                gameObjectSet.add(h);
            }
            gameObjectSet.add(player);

            return gameObjectSet;
        }

        public Player getPlayer() {
            return player;
        }

        public Set<Box> getBoxes() {
            return boxes;
        }

        public Set<Home> getHomes() {
            return homes;
        }

        public Set<Wall> getWalls() {
            return walls;
        }

}
