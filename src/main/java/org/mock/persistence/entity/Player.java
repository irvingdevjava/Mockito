package org.mock.persistence.entity;

public class Player {
    private Long Id;
    private String name;
    private String team;
    private String position;
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Player(Long id, String name, String team, String position) {
        Id = id;
        this.name = name;
        this.team = team;
        this.position = position;
    }

    public Player() {
        
    }
    @Override
    public String toString() {
        return "Player {Id=" +
                         Id + "name=" +
                         name + "team=" + 
                         team + "position=" + 
                         position + "}";
    }
}
