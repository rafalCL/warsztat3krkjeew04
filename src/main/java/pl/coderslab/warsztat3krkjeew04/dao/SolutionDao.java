package pl.coderslab.warsztat3krkjeew04.dao;

import pl.coderslab.warsztat3krkjeew04.model.Solution;
import pl.coderslab.warsztat3krkjeew04.model.User;
import pl.coderslab.warsztat3krkjeew04.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SolutionDao {
    private String READ_RECENT_QUERY = "SELECT id, created, updated, description, exercise_id, users_id " +
            "                           FROM solutions ORDER BY updated LIMIT ?;";



    public List<Solution> findRecent(int howMany){
        List<Solution> result = new ArrayList<>();

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(READ_RECENT_QUERY);
            statement.setInt(1, howMany);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Solution sol = new Solution();
                sol.setId(resultSet.getInt("id"));
                sol.setUpdate(resultSet.getTimestamp("updated").toLocalDateTime());
                sol.setDescription(resultSet.getString("description"));
                // todo finish read other properties

                result.add(sol);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
