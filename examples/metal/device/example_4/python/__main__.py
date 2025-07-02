import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tftest",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system="ubuntu_24_04",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    hardware_reservation_id="next-available",
    storage="""{
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
