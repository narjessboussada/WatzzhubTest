package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChargePageObject;

public class StationStepDefinitions extends TestBase {

    private ChargePageObject chargePageObject;
    private WebDriver driver;
    String template = "{\n" +
            "    \"chargePointVendor\": \"Arij\",\n" +
            "    \"capabilities\": [\n" +
            "        {\n" +
            "            \"supportedFirmwareVersions\": [\n" +
            "                \"4.0.4.22\"\n" +
            "            ],\n" +
            "            \"supportedOcppVersions\": [\n" +
            "                \"1.6\"\n" +
            "            ],\n" +
            "            \"capabilities\": {\n" +
            "                \"supportStaticLimitation\": true,\n" +
            "                \"supportChargingProfiles\": true,\n" +
            "                \"supportCreditCard\": true,\n" +
            "                \"supportRemoteStartStopTransaction\": true,\n" +
            "                \"supportUnlockConnector\": true,\n" +
            "                \"supportReservation\": true,\n" +
            "                \"supportRFIDCard\": true\n" +
            "            }\n" +
            "        }\n" +
            "    ],\n" +
            "    \"ocppStandardParameters\": [\n" +
            "        {\n" +
            "            \"supportedFirmwareVersions\": [\n" +
            "                \"4.0.4.22\"\n" +
            "            ],\n" +
            "            \"supportedOcppVersions\": [\n" +
            "                \"1.6\"\n" +
            "            ],\n" +
            "            \"parameters\": {\n" +
            "                \"AllowOfflineTxForUnknownId\": \"\",\n" +
            "                \"AuthorizationCacheEnabled\": \"\",\n" +
            "                \"AuthorizeRemoteTxRequests\": \"\",\n" +
            "                \"BlinkRepeat\": \"\",\n" +
            "                \"ClockAlignedDataInterval\": \"\",\n" +
            "                \"ConnectionTimeOut\": \"\",\n" +
            "                \"GetConfigurationMaxKeys\": \"\",\n" +
            "                \"HeartbeatInterval\": \"\",\n" +
            "                \"LightIntensity\": \"\",\n" +
            "                \"LocalAuthorizeOffline\": \"\",\n" +
            "                \"LocalPreAuthorize\": \"\",\n" +
            "                \"MaxEnergyOnInvalidId\": \"\",\n" +
            "                \"MeterValuesAlignedData\": \"\",\n" +
            "                \"MeterValuesAlignedDataMaxLength\": \"\",\n" +
            "                \"MeterValuesSampledData\": \"\",\n" +
            "                \"MeterValuesSampledDataMaxLength\": \"\",\n" +
            "                \"MeterValueSampleInterval\": \"\",\n" +
            "                \"MinimumStatusDuration\": \"\",\n" +
            "                \"NumberOfConnectors\": \"\",\n" +
            "                \"ResetRetries\": \"\",\n" +
            "                \"ConnectorPhaseRotation\": \"\",\n" +
            "                \"ConnectorPhaseRotationMaxLength\": \"\",\n" +
            "                \"StopTransactionOnEVSideDisconnect\": \"\",\n" +
            "                \"StopTransactionOnInvalidId\": \"\",\n" +
            "                \"StopTxnAlignedData\": \"\",\n" +
            "                \"StopTxnAlignedDataMaxLength\": \"\",\n" +
            "                \"StopTxnSampledData\": \"\",\n" +
            "                \"StopTxnSampledDataMaxLength\": \"\",\n" +
            "                \"SupportedFeatureProfiles\": \"\",\n" +
            "                \"SupportedFeatureProfilesMaxLength\": \"\",\n" +
            "                \"TransactionMessageAttempts\": \"\",\n" +
            "                \"TransactionMessageRetryInterval\": \"\",\n" +
            "                \"UnlockConnectorOnEVSideDisconnect\": \"\",\n" +
            "                \"WebSocketPingInterval\": \"\",\n" +
            "                \"LocalAuthListEnabled\": \"\",\n" +
            "                \"LocalAuthListMaxLength\": \"\",\n" +
            "                \"SendLocalListMaxLength\": \"\",\n" +
            "                \"ReserveConnectorZeroSupported\": \"\",\n" +
            "                \"ChargeProfileMaxStackLevel\": \"\",\n" +
            "                \"ChargingScheduleAllowedChargingRateUnit\": \"\",\n" +
            "                \"ChargingScheduleMaxPeriods\": \"\",\n" +
            "                \"ConnectorSwitch3to1PhaseSupported\": \"\",\n" +
            "                \"MaxChargingProfilesInstalled\": \"\"\n" +
            "            }\n" +
            "        }\n" +
            "    ],\n" +
            "    \"ocppVendorParameters\": [\n" +
            "        {\n" +
            "            \"supportedFirmwareVersions\": [\n" +
            "                \"4.0.4.22\"\n" +
            "            ],\n" +
            "            \"supportedOcppVersions\": [\n" +
            "                \"1.6\"\n" +
            "            ],\n" +
            "            \"parameters\": {}\n" +
            "        }\n" +
            "    ],\n" +
            "    \"extraFilters\": {\n" +
            "        \"chargePointModel\": \"MD_TERRA_53\"\n" +
            "    },\n" +
            "    \"technical\": {\n" +
            "        \"masterSlave\": true,\n" +
            "        \"maximumPower\": 3680,\n" +
            "        \"voltage\": 230,\n" +
            "        \"powerLimitUnit\": \"W\",\n" +
            "        \"chargePoints\": [\n" +
            "            {\n" +
            "                \"chargePointID\": 1,\n" +
            "                \"currentType\": \"DC\",\n" +
            "                \"amperage\": 16,\n" +
            "                \"numberOfConnectedPhase\": 1,\n" +
            "                \"cannotChargeInParallel\": true,\n" +
            "                \"sharePowerToAllConnectors\": true,\n" +
            "                \"excludeFromPowerLimitation\": false,\n" +
            "                \"ocppParamForPowerLimitation\": \"xxx\",\n" +
            "                \"power\": 3680,\n" +
            "                \"efficiency\": 80,\n" +
            "                \"connectorIDs\": [\n" +
            "                    1\n" +
            "                ]\n" +
            "            }\n" +
            "        ],\n" +
            "        \"connectors\": [\n" +
            "            {\n" +
            "                \"connectorId\": 1,\n" +
            "                \"type\": \"T2\",\n" +
            "                \"power\": 3680,\n" +
            "                \"amperage\": 16,\n" +
            "                \"chargePointID\": 1,\n" +
            "                \"numberOfConnectedPhase\": 1\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public StationStepDefinitions() {
        driver = TestBase.getDriver();
        this.chargePageObject = new ChargePageObject(driver);
    }

    @When("cliquer sur le bouton Chargin Station Templates")
    public void cliquer_sur_le_bouton_chargin_station_templates() {
        try {
            chargePageObject.Cliquer_Charge();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur le bouton Chargin Station Templates", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario
                    .fail(MarkupHelper.createLabel("cliquer sur le bouton Chargin Station Templates", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("se navigue à la page Chargin Station Templates")
    public void se_navigue_à_la_page_chargin_station_templates() throws InterruptedException {
        try {
            TestBase.getDriver()
                    .get("https://cpo.beta.wattzhub.com/charging-station-templates#charging-station-templates");
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("se navigue à la page Chargin Station Templates", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario
                    .fail(MarkupHelper.createLabel("se navigue à la page Chargin Station Templates", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("cliquer sur le bouton create")
    public void cliquer_sur_le_bouton_create() {
        try {
            chargePageObject.Create();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("cliquer sur le bouton create", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("cliquer sur le bouton create", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @When("saisir JSON template")
    public void saisir_json_template() {
        try {
            chargePageObject.SaisirTemplate(template);
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Saisir JSON template", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Saisir JSON template", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }

    @Then("cliquer sur l'icone enregistrer")
    public void cliquer_sur_l_icone_enregistrer() {
        try {
            chargePageObject.enregistrer();
            Hooks._scenario.log(Status.PASS,
                    MarkupHelper.createLabel("Cliquer sur l'icone enregistrer", ExtentColor.GREEN));
        } catch (Exception e) {
            Hooks._scenario.fail(MarkupHelper.createLabel("Cliquer sur l'icone enregistrer", ExtentColor.RED));
            Hooks._scenario.fail(MarkupHelper.createLabel(e.getMessage(), ExtentColor.WHITE));
            throw e;
        }
    }
}
