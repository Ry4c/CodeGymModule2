package view;

public class MenuData {
    public String getLogin() {
        return "Dang nhap:";
    }

    public String getAdmin() {
        return "1.Tao moi\n2.Sua thong tin\n3.Xoa tai khoan\n4.Tim kiem\n0.Dang xuat";
    }

    public String getAdminAdd() {
        return "1.Tao moi user\n2.Tao moi Hoc sinh\n0.Tro ve muc truoc";
    }

    public String getAdminEdit() {
        return "1.Doi mat khau user\n2.Doi mat khau hoc sinh\n3.Doi thong tin hoc sinh\n4.Doi mat khau\n0.Tro ve muc truoc";
    }

    public String getSearchMenu() {
        return "1.Tim kiem hoc sinh theo ten\n2.Tim hoc sinh theo id\n3.Tim lop\n0.Tro ve muc truoc";
    }

    public String getUserMenu() {
        return "1.Tao moi hoc sinh\n2.Sua thong tin \n3.Xoa hoc sinh\n4.Tim kiem\n0.Dang xuat";
    }

    public String getUserEdit() {
        return "1.Doi mat khau\n2.Sua thong tin hoc sinh\n0.Tro ve muc truoc";
    }

    public String getStudentMenu() {
        return "1.Doi mat khau\n2.Hien thi danh sach lop\n0.Dang xuat";
    }
}
