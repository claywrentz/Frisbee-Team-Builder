//package com.team.builder.frisbeeteambuilder.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class PlayerGameKey implements Serializable {
//
//    private Integer playerID;
//    private Integer gameID;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PlayerGameKey that = (PlayerGameKey) o;
//        return Objects.equals(playerID, that.playerID) && Objects.equals(gameID, that.gameID);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(playerID, gameID);
//    }
//}
