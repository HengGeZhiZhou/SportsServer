package entity;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2016/12/24.
 */
public class ReturnInfo<T> {
    private  int resultCode;
    private String resultMessage;
    private  T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnInfo{" +
                "resultCode=" + resultCode +
                ", resultMessage='" + resultMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
