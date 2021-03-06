/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

using System;
using NUnit.Framework;
using NUnitExtension.OutSystems.Framework;
using OutSystems.HubEdition.Extensibility.Data.ConfigurationService;
using OutSystems.HubEdition.Extensibility.Data.ConfigurationService.MetaConfiguration;
using OutSystems.ServerTests.DatabaseProvider.Framework;

namespace OutSystems.ServerTests.DatabaseProvider.ConfigurationService {

    [DashboardTestFixture(DashboardTest.DashboardTestKind)]
    public class ParameterTests : DashboardTest
    {

        public enum DirectionsEnum { Up, Down, Left, Right }

        public class MockDatabaseConfiguration : IIntegrationDatabaseConfiguration
        {
            [UserDefinedConfigurationParameter(Label = "MockText", Region = ParameterRegion.DatabaseLocation, Prompt = "MockText_Prompt", Order = 1, IsMandatory = true, IsPassword = false)]
            public string MockText { get; set; }

            [UserDefinedConfigurationParameter(Label = "MockInt", Region = ParameterRegion.UserSpecific, Prompt = "MockInt_Prompt", Order = 1, IsMandatory = true, Example = "MockInt_Example")]
            public int MockInt { get; set; }

            [UserDefinedConfigurationParameter(Label = "MockBool", Region = ParameterRegion.UserAdminSpecific, Prompt = "MockBool_Prompt", Order = 2, Example = "MockBool_Example")]
            public bool MockBool { get; set; }

            [UserDefinedConfigurationParameter(Label = "MockEnum", Region = ParameterRegion.Advanced, Prompt = "MockEnum_Prompt", Order = 3, Example = "MockEnum_Example")]
            public DirectionsEnum MockEnum { get; set; }


            [UserDefinedConfigurationParameter(Label = "Invalid", Region = ParameterRegion.Advanced, Prompt = "MockEnum_Prompt", Order = 3, Example = "MockEnum_Example")]
            public float MockInvalid { get; set; }

            public HubEdition.Extensibility.Data.IDatabaseProvider DatabaseProvider {
                get { throw new NotImplementedException(); }
            }

            public string ConnectionString {
                get { throw new NotImplementedException(); }
            }

            public string ConnectionStringOverride {
                get {
                    throw new NotImplementedException();
                }
                set {
                    throw new NotImplementedException();
                }
            }

            public string DatabaseIdentifier {
                get {
                    throw new NotImplementedException();
                }
                set {
                    throw new NotImplementedException();
                }
            }

            private AdvancedConfiguration advancedConfiguration = new AdvancedConfiguration(null, null, null);

            public AdvancedConfiguration AdvancedConfiguration {
                get {
                    return advancedConfiguration;
                }
            }

            public IRuntimeDatabaseConfiguration RuntimeDatabaseConfiguration {
                get { return null; }
            }
        }

        private MockDatabaseConfiguration config;
        private MetaDatabaseConfiguration wrapper;

        public override void SetUp() {
            config = new MockDatabaseConfiguration();
            wrapper = new MetaDatabaseConfiguration(config);
        }

        [Test(Description = "Check conversion for enum parameters")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        public void TestEnumValueConvertion() {

            config.MockEnum = DirectionsEnum.Down;
            Assert.AreEqual("Down", wrapper.GetParameter("MockEnum").Get());

            wrapper.GetParameter("MockEnum").Set("Left");
            Assert.AreEqual(DirectionsEnum.Left, config.MockEnum);

            wrapper.GetParameter("MockEnum").Set("");
            Assert.AreEqual(Enum.GetValues(typeof(DirectionsEnum)).GetValue(0), config.MockEnum,
                "Empty string should be converted to the first Enum value returned by Enum.GetValues in C# and getEnumConstants in Java");

        }

        [Test(Description = "Check conversion for int parameters")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        public void TestIntValueConvertion() {

            config.MockInt = 1;
            Assert.AreEqual("1", wrapper.GetParameter("MockInt").Get());

            wrapper.GetParameter("MockInt").Set("3");
            Assert.AreEqual(3, config.MockInt);

            wrapper.GetParameter("MockInt").Set("");
            Assert.AreEqual(0, config.MockInt, "Empty string should be converted to int 0");

        }

        [Test(Description = "Check conversion for text parameters")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        public void TestTextValueConvertion() {

            config.MockText = "o gawd";
            Assert.AreEqual("o gawd", wrapper.GetParameter("MockText").Get());

            wrapper.GetParameter("MockText").Set("o my");
            Assert.AreEqual("o my", config.MockText);

        }

        [Test(Description = "Check conversion for bool parameters")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        public void TestBoolValueConvertion() {

            config.MockBool = true;
            Assert.AreEqual("true", wrapper.GetParameter("MockBool").Get());

            wrapper.GetParameter("MockBool").Set("false");
            Assert.AreEqual(false, config.MockBool);

            wrapper.GetParameter("MockBool").Set("true");
            Assert.AreEqual(true, config.MockBool);

            wrapper.GetParameter("MockBool").Set("");
            Assert.AreEqual(false, config.MockBool, "Empty string should be converted to boolean false");

        }

        [Test(Description = "Check if a parameter with value null is returned as an empty string")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        public void TestNullValueParameterReturnedAsEmptyString() {
            Assert.AreEqual(string.Empty, wrapper.GetParameter("MockText").Get());
        }

        [Test(Description = "Check if setting parameter with invalid type throws an exception")]
        [TestDetails(CreatedBy = "rcn", Feature = "Database Abstraction Layer", TestIssue = "613292")]
        [ExpectedException(typeof(ConfigurationReflectionException))]
        public void TestSettingParameterWithUnsupportedTypeConversionThrowsException() {
            wrapper.GetParameter("MockInvalid").Set("1.233");
        }

        [Test(Description = "Check if we can Get AdvancedConnectionStringField from wrapper")]
        [TestDetails(CreatedBy = "lfl", Feature = "Database Abstraction Layer", TestIssue = "609920")]
        public void TestGetAdvancedConnectionStringField() {
            config = new MockDatabaseConfiguration();
            config.AdvancedConfiguration.AdvancedConnectionStringField = "nonnull";
            wrapper = new MetaDatabaseConfiguration(config);
            Assert.AreEqual("nonnull", wrapper.GetParameter("AdvancedConnectionStringField").Get());
        }

        [Test(Description = "Check if we can Set AdvancedConnectionStringField thru wrapper")]
        [TestDetails(CreatedBy = "lfl", Feature = "Database Abstraction Layer", TestIssue = "609920")]
        public void TestSetAdvancedConnectionStringField() {
            config = new MockDatabaseConfiguration();
            config.AdvancedConfiguration.AdvancedConnectionStringField = "nonnull";
            wrapper = new MetaDatabaseConfiguration(config);
            wrapper.GetParameter("AdvancedConnectionStringField").Set("otherNonNull");
            Assert.AreEqual("otherNonNull", config.AdvancedConfiguration.AdvancedConnectionStringField);
        }

    }
}
