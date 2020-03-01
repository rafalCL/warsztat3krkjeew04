package pl.coderslab.warsztat3krkjeew04.model;

import java.time.LocalDateTime;

public class Solution {
    private int id;
    private LocalDateTime created;
    private LocalDateTime update;
    private String description;
    private int exerciseId;
    private int usersId;

    public Solution(int id, LocalDateTime created, LocalDateTime update, String description, int exerciseId, int usersId) {
        this.id = id;
        this.created = created;
        this.update = update;
        this.description = description;
        this.exerciseId = exerciseId;
        this.usersId = usersId;
    }

    public Solution() {}

    public Solution(LocalDateTime created, int exerciseId, int usersId) {
        this.created = created;
        this.exerciseId = exerciseId;
        this.usersId = usersId;
    }



    public Solution(String description, LocalDateTime update, int id) {
        this.id = id;
        this.update = update;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdate() {
        return update;
    }

    public void setUpdate(LocalDateTime update) {
        this.update = update;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
}
