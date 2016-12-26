package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/12/25.
 */
@Entity
public class History {
    private int count;
    private String id;
    private Timestamp date;
    private String position;
    private String type;

    @Id
    @Column(name = "_count")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Basic
    @Column(name = "_id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "_date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "_position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "_type")
    public String getWins() {
        return type;
    }

    public void setWins(String wins) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        History history = (History) o;

        if (count != history.count) return false;
        if (type != history.type) return false;
        if (id != null ? !id.equals(history.id) : history.id != null) return false;
        if (date != null ? !date.equals(history.date) : history.date != null) return false;
        if (position != null ? !position.equals(history.position) : history.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = count;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = Integer.parseInt(31 * result + type);
        return result;
    }
}
