package Service;

import Models.HocVien;

import java.util.ArrayList;

public class HocVienService {
    public ArrayList<HocVien> list = new ArrayList<>();
    public HocVienService(){
        list.add(new HocVien("son","13/10","hung yen","123456","son@gmail.com","tk15.2"));
        list.add(new HocVien("linh","27/07","ha noi","023456","linh@gmail.com","tk16.2"));
    }

    public void save (HocVien hocVien){
        list.add(hocVien);
    }

    public void delete(int index){
        list.remove(index);
    }

    public void edit(HocVien hocVien,int index){
        list.set(index,hocVien);
    }

        public static ArrayList<HocVien> findByName(String name) {
            ArrayList<HocVien> list = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().contains(name)) {
                    list.add(list.get(i));
                }
            }
            return list;
        }

}
