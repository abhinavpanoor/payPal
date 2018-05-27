Feature: Create Lead in LeafTaps
Background:
Given enter the username as DemoCSR
And enter the password as crmsfa

Scenario Outline: Create a Lead in LeafTaps Application
And click on login button
And click on crmsfa
And click on Leads
And click create lead 
And enter company name as <companyName>
And enter first name as <firstName>
And enter last name as <lastName>
And click on create lead
#Then lead should be created

Examples:
|companyName|firstName|lastName|
|IBM|Abhinav|V|
|TCS|Muthu|P|


