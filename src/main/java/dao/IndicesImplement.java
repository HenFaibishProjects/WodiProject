package dao;

import Connections.HibernateStructInfo;
import hr.Indices;

import java.util.Date;

public class IndicesImplement extends HibernateStructInfo implements IndicesDao {
    @Override
    public void add(int userId,Date measurementDate, int high, float weight, int bloodPressureSystolic, int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
        Indices indices = new Indices(userId, measurementDate,high,weight,bloodPressureSystolic,bloodPressureDiastolic,pulsePressure,fatPercentage);
    }
}
