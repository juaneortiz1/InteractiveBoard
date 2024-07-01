package edu.escuelaing.arsw.ASE.app.interactiveBoard;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {

    private List<Point> points = new ArrayList<>();

    @PostMapping("/points")
    public void addPoint(@RequestBody Point point) {
        points.add(point);
    }

    @GetMapping("/points")
    public List<Point> getPoints() {
        return points;
    }

    @DeleteMapping("/points")
    public void clearPoints() {
        points.clear();
    }

    public static class Point {
        private int x;
        private int y;

        public Point() {}

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}

