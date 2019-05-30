package dao;

import java.util.Date;

public interface IndicesDao {

    void add(Date measurementDate, int high, float weight, int bloodPressureSystolic,
             int bloodPressureDiastolic, int pulsePressure, float fatPercentage);
}
