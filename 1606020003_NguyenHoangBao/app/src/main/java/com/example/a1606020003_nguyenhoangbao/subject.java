package com.example.a1606020003_nguyenhoangbao;

public class subject {
        private int ID;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getSubject_Code() {
            return Subject_Code;
        }

        public void setSubject_Code(String subject_Code) {
            Subject_Code = subject_Code;
        }

        public String getSubject_Name() {
            return Subject_Name;
        }

        public void setSubject_Name(String subject_Name) {
            Subject_Name = subject_Name;
        }

        public int getCredits() {
            return Credits;
        }

        public void setCredits(int credits) {
            Credits = credits;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        private String Subject_Code;
        private String Subject_Name;
        private int Credits;
        private String Description;
}
