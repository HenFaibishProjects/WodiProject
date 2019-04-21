package hr;


import java.util.Date;
import javax.persistence.*;


@Entity
    @Table(name = "Indices")
    public class Indices {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
        private int indicesID;
        private int userId;
        protected Date measurementDate;
        protected int high;
        protected float weight;
        protected int bloodPressureSystolic;
        protected int bloodPressureDiastolic;
        protected int pulsePressure;
        protected float fatPercentage;

        public Indices() {

        }


        public Indices(int userId,Date measurementDate, int high, float weight, int bloodPressureSystolic,
                       int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
            this.userId = userId;
            this.measurementDate = measurementDate;
            this.high = high;
            this.weight = weight;
            this.bloodPressureSystolic = bloodPressureSystolic;
            this.bloodPressureDiastolic = bloodPressureDiastolic;
            this.pulsePressure = pulsePressure;
            this.fatPercentage = fatPercentage;

        }

        public int getIndicesID() {
            return indicesID;

        }

        public void setIndicesID(int indicesID) {
            this.indicesID = indicesID;

        }


        public Date getMeasurementDate() {
            return measurementDate;

        }


        public void setMeasurementDate(Date measurementDate) {
            this.measurementDate = measurementDate;

        }

        public int getHigh() {
            return high;

        }


        public void setHigh(int high) {
            this.high = high;

        }

        public float getWeight() {
            return weight;

        }

        public void setWeight(float weight) {
            this.weight = weight;

        }

        public int getBloodPressureSystolic() {
            return bloodPressureSystolic;

        }

        public void setBloodPressureSystolic(int bloodPressureSystolic) {
            this.bloodPressureSystolic = bloodPressureSystolic;

        }

        public int getBloodPressureDiastolic() {
            return bloodPressureDiastolic;

        }

        public void setBloodPressureDiastolic(int bloodPressureDiastolic) {
            this.bloodPressureDiastolic = bloodPressureDiastolic;

        }

        public int getPulsePressure() {
            return pulsePressure;
        }

        public void setPulsePressure(int pulsePressure) {
            this.pulsePressure = pulsePressure;
        }

        public float getFatPercentage() {
            return fatPercentage;
        }

        public void setFatPercentage(float fatPercentage) {
            this.fatPercentage = fatPercentage;

        }
    }


