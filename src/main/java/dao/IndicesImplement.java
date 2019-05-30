package dao;

import Connections.HibernateStructInfo;
import Login.SystemLogin;
import hr.Indices;

import java.util.Date;

public class IndicesImplement extends HibernateStructInfo implements IndicesDao {
    @Override
    public void add(Date measurementDate, int high, float weight, int bloodPressureSystolic, int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
        Indices indices = new Indices(SystemLogin.sessionId, measurementDate,high,weight,bloodPressureSystolic,bloodPressureDiastolic,pulsePressure,fatPercentage);
        beginTranscation();
        super.saveOrUpdate(indices);
    }
}
