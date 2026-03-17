package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
			Hostname:              pulumi.String("tftest"),
			Plan:                  pulumi.String(metal.PlanC3SmallX86),
			Metro:                 pulumi.String("ny"),
			OperatingSystem:       pulumi.String("ubuntu_24_04"),
			BillingCycle:          pulumi.String(metal.BillingCycleHourly),
			ProjectId:             pulumi.Any(projectId),
			HardwareReservationId: pulumi.String("next-available"),
			Storage:               pulumi.String("{  \\\"disks\\\": [    {      \\\"device\\\": \\\"/dev/sda\\\",      \\\"wipeTable\\\": true,      \\\"partitions\\\": [        {          \\\"label\\\": \\\"BIOS\\\",          \\\"number\\\": 1,          \\\"size\\\": \\\"4096\\\"        },        {          \\\"label\\\": \\\"SWAP\\\",          \\\"number\\\": 2,          \\\"size\\\": \\\"3993600\\\"        },        {          \\\"label\\\": \\\"ROOT\\\",          \\\"number\\\": 3,          \\\"size\\\": \\\"0\\\"        }      ]    }  ],  \\\"filesystems\\\": [    {      \\\"mount\\\": {        \\\"device\\\": \\\"/dev/sda3\\\",        \\\"format\\\": \\\"ext4\\\",        \\\"point\\\": \\\"/\\\",        \\\"create\\\": {          \\\"options\\\": [            \\\"-L\\\",            \\\"ROOT\\\"          ]        }      }    },    {      \\\"mount\\\": {        \\\"device\\\": \\\"/dev/sda2\\\",        \\\"format\\\": \\\"swap\\\",        \\\"point\\\": \\\"none\\\",        \\\"create\\\": {          \\\"options\\\": [            \\\"-L\\\",            \\\"SWAP\\\"          ]        }      }    }  ]}\n"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
