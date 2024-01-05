package chain_of_resposibility.do_ve_so;

public interface IHandle {
    //Giải kế tiếp
    IHandle giaiKeTiep(IHandle successor);
    String TrungGiai(String veSo);
}
