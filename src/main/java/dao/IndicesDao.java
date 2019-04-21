package dao;

import java.util.Date;

public interface IndicesDao {

    void add(int userId,Date measurementDate, int high, float weight, int bloodPressureSystolic,
             int bloodPressureDiastolic, int pulsePressure, float fatPercentage);
}
