<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_NameBirthdayoutsystems</name>
   <tag></tag>
   <elementGuidId>ccb4331b-7841-4625-a50c-bcc72152acab</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='ITUpTheme_wt151_block_wtMainContent_wtEditEmployee']/div[2]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ThemeGrid_Width9 ThemeGrid_MarginGutter</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	
		NameBirthday
outsystems.internal.$(function() {
  if (outsystems.internal.$('#ITUpTheme_wt151_block_wtMainContent_wtEmployee_BirthDay').attr('readonly'))
    return;

     var SPECIAL_DAYS = {};
    
     function dateIsSpecial(year, month, day) {
        var m = SPECIAL_DAYS[month + 1];
        if (!m)
            return false;
        for (var i in m)
            if (m[i] == day) 
                return true;
        return false;
     };

    RichWidgets_Calendar.setup(
    {
        inputField      :   &quot;ITUpTheme_wt151_block_wtMainContent_wtEmployee_BirthDay&quot;, 
        eventName       :   &quot;click&quot;,
        ifFormat        :   &quot;%Y-%m-%d&quot;,      
        align           :   &quot;Bl&quot;,           
        singleClick     :   true,
        weekNumbers     :   false,
        showOthers      :   false,
        timeFormat      :   24, 
        showsTime       :   false,
        firstDay        :   0, date           :   new Date(1999,7,14, 0, 0, 0), 
        electric        :   true, 
        step            :   2,
        cache           :   false
    });

});

outsystems.internal.$(function() {var inpid='ITUpTheme_wt151_block_wtMainContent_wtEmployee_BirthDay';
var inputData=OsInputPrompt_GetInputData(outsystems.internal.$('#'+inpid));
var prompt = (inputData || {}).prompt;
var iplaceholder = outsystems.internal.$('#'+inpid)[0].placeholder;
if((iplaceholder == 'undefined' || iplaceholder == '' ) &amp;&amp; typeof(prompt)=='undefined'||prompt==''){
OsInputPrompt_Bootstrap('ITUpTheme_wt151_block_wtMainContent_wtEmployee_BirthDay', 'YYYY-MM-DD');}
});
GenderFemaleMaleOrganization
			-
			IOHub
			Org Finance &amp; HR
			Org ITUp
			Org ITUp - Osquay
			Org ITUp - Out Contractors
			Org ITUp - Services
			Org OSQuay 2
			Org Singapore
			Org Training
			Portugal
			TTI

		Job Title
			-
			Accountant
			CEO
			COO
			CPO
			CTO
			Delivery Manager
			Developer
			Engagement Manager
			HR Assistant
			HR Manager
			IT Recruiter
			Junior Developer
			Sales VP
			Senior Developer
			Trainee
			Trainer

		Responsible for evaluation
			-
			Ana Reis
			André Vieira
			Célia Roma
			Diego Meira
			Francisca Jesus
			Inês (DEV Test)
			Lara Silva
			Laura Fidalgo
			Meri Hayrapetyan
			Paulo Reis
			Pedro Paulino
			Rui Félix
			Vera Sá

		Managed By
			-
			Ana Reis
			André Vieira
			Célia Roma
			Diego Meira
			Francisca Jesus
			Inês (DEV Test)
			Lara Silva
			Laura Fidalgo
			Meri Hayrapetyan
			Paulo Reis
			Pedro Paulino
			Rui Félix
			Vera Sá

		Country office
			-
			Netherlands
			Portugal
			Singapore

		
	

	
		Username
	
	
		Email
	
	
		Mobile Phone
	
	
		Skype Username
	
	
		Extension
	
	
		Employee Code
	
	
		Entry DateDate expected!outsystems.internal.$(function(){OsValidatorShowInvalidInput('ITUpTheme_wt151_block_wtMainContent_wtEmployee_EntryDate', 'Date expected!');});
outsystems.internal.$(function() {
  if (outsystems.internal.$('#ITUpTheme_wt151_block_wtMainContent_wtEmployee_EntryDate').attr('readonly'))
    return;

     var SPECIAL_DAYS = {};
    
     function dateIsSpecial(year, month, day) {
        var m = SPECIAL_DAYS[month + 1];
        if (!m)
            return false;
        for (var i in m)
            if (m[i] == day) 
                return true;
        return false;
     };

    RichWidgets_Calendar.setup(
    {
        inputField      :   &quot;ITUpTheme_wt151_block_wtMainContent_wtEmployee_EntryDate&quot;, 
        eventName       :   &quot;click&quot;,
        ifFormat        :   &quot;%Y-%m-%d&quot;,      
        align           :   &quot;Bl&quot;,           
        singleClick     :   true,
        weekNumbers     :   false,
        showOthers      :   false,
        timeFormat      :   24, 
        showsTime       :   false,
        firstDay        :   0, date           :   new Date(2019,7,14, 0, 0, 0), 
        electric        :   true, 
        step            :   2,
        cache           :   false
    });

});

outsystems.internal.$(function() {var inpid='ITUpTheme_wt151_block_wtMainContent_wtEmployee_EntryDate';
var inputData=OsInputPrompt_GetInputData(outsystems.internal.$('#'+inpid));
var prompt = (inputData || {}).prompt;
var iplaceholder = outsystems.internal.$('#'+inpid)[0].placeholder;
if((iplaceholder == 'undefined' || iplaceholder == '' ) &amp;&amp; typeof(prompt)=='undefined'||prompt==''){
OsInputPrompt_Bootstrap('ITUpTheme_wt151_block_wtMainContent_wtEmployee_EntryDate', 'YYYY-MM-DD');}
});

	
	
		End Date
outsystems.internal.$(function() {
  if (outsystems.internal.$('#ITUpTheme_wt151_block_wtMainContent_wtEmployee_EndedOn').attr('readonly'))
    return;

     var SPECIAL_DAYS = {};
    
     function dateIsSpecial(year, month, day) {
        var m = SPECIAL_DAYS[month + 1];
        if (!m)
            return false;
        for (var i in m)
            if (m[i] == day) 
                return true;
        return false;
     };

    RichWidgets_Calendar.setup(
    {
        inputField      :   &quot;ITUpTheme_wt151_block_wtMainContent_wtEmployee_EndedOn&quot;, 
        eventName       :   &quot;click&quot;,
        ifFormat        :   &quot;%Y-%m-%d&quot;,      
        align           :   &quot;Bl&quot;,           
        singleClick     :   true,
        weekNumbers     :   false,
        showOthers      :   false,
        timeFormat      :   24, 
        showsTime       :   false,
        firstDay        :   0, 
        electric        :   true, 
        step            :   2,
        cache           :   false
    });

});

outsystems.internal.$(function() {var inpid='ITUpTheme_wt151_block_wtMainContent_wtEmployee_EndedOn';
var inputData=OsInputPrompt_GetInputData(outsystems.internal.$('#'+inpid));
var prompt = (inputData || {}).prompt;
var iplaceholder = outsystems.internal.$('#'+inpid)[0].placeholder;
if((iplaceholder == 'undefined' || iplaceholder == '' ) &amp;&amp; typeof(prompt)=='undefined'||prompt==''){
OsInputPrompt_Bootstrap('ITUpTheme_wt151_block_wtMainContent_wtEmployee_EndedOn', 'YYYY-MM-DD');}
});

	
	
		Is Directory Manager
	
	
		Is Allocable?
	
	
		Main Company
			-
			IT Up Singapore
			IT Up. Lda
			Osquay
			X_Beyond Challenge

		
	
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;ITUpTheme_wt151_block_wtMainContent_wtEditEmployee&quot;)/div[@class=&quot;ThemeGrid_Width9 ThemeGrid_MarginGutter&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='ITUpTheme_wt151_block_wtMainContent_wtEditEmployee']/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Organizations'])[1]/following::div[22]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='JobTitles'])[1]/following::div[22]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div[3]/div/div[2]/div/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
