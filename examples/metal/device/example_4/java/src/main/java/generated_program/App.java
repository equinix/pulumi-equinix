package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Device;
import com.pulumi.equinix.metal.DeviceArgs;
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
        var web1 = new Device("web1", DeviceArgs.builder()
            .hostname("tftest")
            .plan("c3.small.x86")
            .metro("ny")
            .operatingSystem("ubuntu_24_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .hardwareReservationId("next-available")
            .storage("""
{
  \"disks\": [
    {
      \"device\": \"/dev/sda\",
      \"wipeTable\": true,
      \"partitions\": [
        {
          \"label\": \"BIOS\",
          \"number\": 1,
          \"size\": \"4096\"
        },
        {
          \"label\": \"SWAP\",
          \"number\": 2,
          \"size\": \"3993600\"
        },
        {
          \"label\": \"ROOT\",
          \"number\": 3,
          \"size\": \"0\"
        }
      ]
    }
  ],
  \"filesystems\": [
    {
      \"mount\": {
        \"device\": \"/dev/sda3\",
        \"format\": \"ext4\",
        \"point\": \"/\",
        \"create\": {
          \"options\": [
            \"-L\",
            \"ROOT\"
          ]
        }
      }
    },
    {
      \"mount\": {
        \"device\": \"/dev/sda2\",
        \"format\": \"swap\",
        \"point\": \"none\",
        \"create\": {
          \"options\": [
            \"-L\",
            \"SWAP\"
          ]
        }
      }
    }
  ]
}
            """)
            .build());

    }
}
