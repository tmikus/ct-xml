/*
 * Copyright 2017 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ct.xml.model.submit.hmrc.ct600a

case class Section2Table(rows: Seq[CommonTableRow])

//object Section2Table extends CommonTableMaker {
//  def apply(boxValueRetriever: CT600ABoxRetriever):Section2Table = {
//    Section2Table(getAllRows(boxValueRetriever))
//  }
//
//  override def getLoanRepaymentRows(boxValueRetriever: CT600ABoxRetriever): Seq[CommonTableRow] = {
//    val apEnd = boxValueRetriever.cp2.value
//    getLoansAndFilter(boxValueRetriever)(l => l.isRepaymentReliefEarlierThanDue(apEnd))
//  }
//
//  override def getWriteOffRows(boxValueRetriever: CT600ABoxRetriever): Seq[CommonTableRow] = {
//    val apEnd = boxValueRetriever.cp2.value
//    getWriteOffsAndFilter(boxValueRetriever){ case (w, l) => w.isReliefEarlierThanDue(apEnd)}
//  }
//
//}