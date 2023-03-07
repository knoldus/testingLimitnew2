package com.knoldus.leader_board

import java.time.{ZoneId, ZonedDateTime}
import java.util.TimeZone

object Constants {
  def indianTimezone: TimeZone = TimeZone.getTimeZone("Asia/Calcutta")

  def currentTime: ZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"))

  val NINE = 9 // this is default studio id allocated to new knolder which cross ponds to intern.
  val DEFAULT_DB_NAME = "knoldus_leaderboard"
  val ACME_DB_NAME = "acme_leaderboard"
  val KNOLDUS_TENANT_NAME = "knoldus"
  val ACME_TENANT_NAME = "acme"
  val CURRENT_MONTH_START_VALUE = 0
  val KNOLDUS_ACCESS_URL: Seq[String] = Seq(
    "backend-qa.knoldus.com",
    "leaderboard.knoldus.com",
    "leaderboard-qa.knoldus.com",
    "knoldus.go1percent.com",
    "leaderboard.go1percent.com",
    "leaderboard-qa.go1percent.com",
    "knoldus.qa.go1percent.com"
  )
  val ACME_ACCESS_URL: Seq[String] = Seq(
    "acme-backend.qa.go1percent.com",
    "acme.go1percent.com",
    "acme.qa.go1percent.com"
  )

  val TENANT_NOT_FOUND = "Tenant not found"
  val ENGLISH_LANGUAGE = "en"
  val FRENCH_LANGUAGE = "fr"

  val NAME_REGEX = "^([A-Za-z]+([\\s-]?)?)+$"
  val EMPTY_PROFILE_PIC = "data:image/jpeg;base64,"
  val LAST_RUN_NO_FOUND = "Last Run Not Found"
  val ALL_TIME_SCORE = "alltime"
  val MONTHLY_SCORE = "monthly"

}

object RewardsConstants {

  val REW_001 = "REW_001"
  val REW_002 = "REW_002"
  val REW_003 = "REW_003"
  val REW_005 = "REW_005"
  val REW_006 = "REW_006"
  val REW_007 = "REW_007"
  val REW_008 = "REW_008"
  val REW_009 = "REW_009"
  val REW_010 = "REW_010"
  val REW_011 = "REW_011"
  val REW_012 = "REW_012"
  val REW_014 = "REW_014"
  val REW_015 = "REW_015"
  val REW_016 = "REW_016"
  val REW_017 = "REW_017"
  val REW_018 = "REW_018"
  val REW_019 = "REW_019"
  val REW_020 = "REW_020"
  val REW_021 = "REW_021"
  val REW_022 = "REW_022"
  val REW_023 = "REW_023"
  val REW_024 = "REW_024"
  val REW_025 = "REW_025"
  val REW_026 = "REW_026"
  val REW_027 = "REW_027"
  val REW_028 = "REW_025"


  // Generic DB exception. Copy error message from db exception
  val REW_004 = "REW_004"
}

object ProposalConstants {
  val PRO_005 = "PRO_005"
  val PRO_008 = "PRO_008"
  val PRO_004 = "PRO_004"
  val PRO_002 = "PRO_002"
  val PRO_003 = "PRO_003"
  val PRO_009 = "PRO_009"
  val PRO_010 = "PRO_010"
  val PRO_011 = "CON_011"
  val PRO_012 = "PRO_012"
  val PRO_013 = "PRO_013"
  val PRO_014 = "PRO_014"
  val PRO_015 = "PRO_015"
  val PRO_016 = "PRO_016"
  val PRO_017 = "PRO_017"
  val PRO_018 = "PRO_018"
  val PRO_019 = "PRO_019"
  val PRO_020 = "PRO_020"
  val PRO_021 = "PRO_021"
  val PRO_022 = "PRO_022"



}

object ContributionConstants {

  val CON_002 = "CON_002"
  val CON_003 = "CON_003"
  val CON_004 = "CON_004"
  val CON_005 = "CON_005"
  val CON_006 = "CON_006"
  val CON_007 = "CON_007"
  val CON_009 = "CON_009"
  val CON_010 = "CON_010"
  val CON_011 = "CON_011"
  val CON_012 = "CON_012"
  val CON_013 = "CON_013"
  val CON_014 = "CON_014"
  val CON_015 = "CON_015"
  val CON_016 = "CON_016"
  val CON_017 = "CON_017"
  val CON_018 = "CON_018"
  val CON_019 = "CON_019"
  val CON_020 = "CON_020"
  val CON_021 = "CON_021"
  val CON_022 = "CON_022"
  val CON_023 = "CON_023"






}

object CharterConstants {
  val CHA_001 = "CHA_001"
  val CHA_002 = "CHA_002"
  val CHA_003 = "CHA_003"
  // Generic DB exception. Copy error message from db exception
  val CHA_004 = "CHA_004"
  val CHA_005 = "CHA_005"
  val CHA_006 = "CHA_006"
  val CHA_007 = "CHA_007"
  val CHA_009 = "CHA_009"
  val CHA_010 = "CHA_010"
  val CHA_011 = "CHA_011"
  val CHA_012 = "CHA_012"
  val CHA_013 = "CHA_013"
  val CHA_014 = "CHA_014"
  val CHA_015 = "CHA_015"
  val CHA_016 = "CHA_016"
}

object DBErrors {
  // Generic DB exception.
  val DB_001 = "DB_001"
}

object KnolderConstants {
  // If knolderId does not exists
  val KNO_001 = "KNO_001"
}

object ProfileUpdatesConstants {
  val PFU_001 = "PFU_001"
  val PFU_002 = "PFU_002"
  val PFU_003 = "PFU_003"
  val PFU_004 = "PFU_004"
  val PFU_005 = "PFU_005"
  val PFU_006 = "PFU_006"
  val PFU_007 = "PFU_007"
  val PFU_008 = "PFU_008"
  val PFU_009 = "PFU_009"
  val PFU_010 = "PFU_010"
  val PFU_011 = "PFU_011"
  val PFU_012 = "PFU_012"



}

object WordPressConstants {
  val WPU_001 = "WPU_001"
  val WPU_002 = "WPU_002"
  val WPU_003 = "WPU_003"
  val WPU_004 = "WPU_004"
}
