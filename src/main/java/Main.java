import java.util.List;
import java.util.Map;
import model.Tag;
import model.User;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.RequestService;
import service.UserPrinter;
import service.UserService;
import service.impl.RequestServiceImpl;
import service.impl.UserPrinterImpl;
import service.impl.UserServiceImpl;

public class Main {
    private static final String API_LINK = "https://api.stackexchange.com/";

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_LINK)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestService requestService = new RequestServiceImpl(retrofit);
        UserService userService = new UserServiceImpl(requestService);
        Map<User, List<Tag>> usersWithTags = userService.findFilteredUsers();

        UserPrinter userPrinter = new UserPrinterImpl();
        userPrinter.print(usersWithTags);
    }
}
