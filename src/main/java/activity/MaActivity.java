package activity;

import javax.persistence.*;

@Entity
@Table(name = "MaActivity")
public class MaActivity extends BaseActivity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        protected int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
        protected Bjj bjj;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
        protected MMA mma;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
        protected MuayThai muayThai;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
        protected BagWorkout bagWorkout;

        public MaActivity() {
        }

        public Bjj getBjj() {
            return bjj;
        }

        public void setBjj(Bjj bjj) {
            this.bjj = bjj;
        }

        public MMA getMma() {
            return mma;
        }

        public void setMma(MMA mma) {
            this.mma = mma;
        }

        public MuayThai getMuayThai() {
            return muayThai;
        }

        public void setMuayThai(MuayThai muayThai) {
            this.muayThai = muayThai;
        }

        public BagWorkout getBagWorkout() {
            return bagWorkout;
        }

        public void setBagWorkout(BagWorkout bagWorkout) {
            this.bagWorkout = bagWorkout;
        }
    }
