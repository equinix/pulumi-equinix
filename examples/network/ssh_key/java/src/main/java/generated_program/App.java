package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.networkedge.SshKey;
import com.pulumi.equinix.networkedge.SshKeyArgs;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var john = new SshKey("john", SshKeyArgs.builder()
            .name("johnKent")
            .publicKey("""
  ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQDpXGdxljAyPp9vH97436U171cX
  2gRkfPnpL8ebrk7ZBeeIpdjtd8mYpXf6fOI0o91TQXZTYtjABzeRgg6/m9hsMOnTHjzWpFyuj/hiPu
  iie1WtT4NffSH1ALQFX/azouBLmdNiYFMLfEVPZleergAqsYOHGCiQuR6Qh5j0yc5Wx+LKxiRZyjsS
  qo+EB8V6xBXi2i5PDJXK+dYG8YU9vdNeQdB84HvTWcGEnLR5w7pgC74pBVwzs3oWLy+3jWS0TKKtfl
  mryeFRufXq87gEkC1MOWX88uQgjyCsemuhPdN++2WS57gu7vcqCMwMDZa7dukRS3JANBtbs7qQhp9N
  w2PB4q6tohqUnSDxNjCqcoGeMNg/0kHeZcoVuznsjOrIDt0HgUApflkbtw1DP7Epfc2MJ0anf5GizM
  8UjMYiXEvv2U/qu8Vb7d5bxAshXM5nh67NSrgst9YzSSodjUCnFQkniz6KLrTkX6c2y2gJ5c9tWhg5
  SPkAc8OqLrmIwf5jGoHGh6eUJy7AtMcwE3iUpbrLw8EEoZDoDXkzh+RbOtSNKXWV4EAXsIhjQusCOW
  WQnuAHCy9N4Td0Sntzu/xhCZ8xN0oO67Cqlsk98xSRLXeg21PuuhOYJw0DLF6L68zU2OO0RzqoNq/F
  jIsltSUJPAIfYKL0yEefeNWOXSrasI1ezw== John.Kent@company.com
            """)
            .type("RSA")
            .projectId("a86d7112-d740-4758-9c9c-31e66373746b")
            .build());

    }
}
