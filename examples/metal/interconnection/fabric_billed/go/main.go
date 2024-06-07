package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		speedInMbps := 200
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		connection, err := metal.NewInterconnection(ctx, "connection", &metal.InterconnectionArgs{
			Name:             pulumi.String("fabric-port-to-metal"),
			ProjectId:        pulumi.String(projectId),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String(metro),
			Speed:            pulumi.String(fmt.Sprintf("%vMbps", speedInMbps)),
			ServiceTokenType: pulumi.String("z_side"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionStatus", connection.Status)
		ctx.Export("connectionTokens", connection.ServiceTokens)
		return nil
	})
}
