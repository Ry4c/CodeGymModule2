package view;

public class MenuData {
    public String getLogin(){
        return "Dang nhap:";
    }
    public String getAdminMenu(){
        return "1.Tao moi\n2.Sua thong tin\n3.Xoa tai khoan\n4.Tim kiem\n0.Dang xuat";
    }
    public String getAdminAddMenu(){
        return "1.Tao moi user\n2.Tao moi Hoc sinh\n0.Tro ve muc truoc";
    }
    public String getAdminEditMenu(){
        return "1.Doi mat khau user\n2.doi mat khau hoc sinh\n3.Doi thong tin hoc sinh\n0.Tro ve muc truoc";
    }
    public String getAdminSearchMenu(){
        return "1.Tim kiem hoc sinh theo ten\n2.Tim hoc sinh theo id\n3.Tim lop\n0.Tro ve muc truoc";
    }
    public String getUserMenu(){
        return "1.Tao moi hoc sinh\n2.Sua thong tin\n3.Xoa hoc sinh\n4.Tim kiem\n0.Dang xuat";
    }
    public String getEditMenu(){
        return "1.Doi mat khau\n2.Sua thong tin hoc sinh\n0.Tro ve muc truoc";
    }
    public String getStudentMenu(){
        return "1.Sua thong tin\n2.Tim kiem thong tin ban hoc\n0.Dang xuat";
    }
}
