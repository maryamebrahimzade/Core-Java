package ir.mapsa.maryamebrahimzadepayment.controllers;

import ir.mapsa.maryamebrahimzadepayment.dto.BankInfoDto;
import ir.mapsa.maryamebrahimzadepayment.dto.CustomerDto;
import ir.mapsa.maryamebrahimzadepayment.models.BankInfo;
import ir.mapsa.maryamebrahimzadepayment.models.Customer;
import ir.mapsa.maryamebrahimzadepayment.services.BankInfoService;
import ir.mapsa.maryamebrahimzadepayment.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankInfo")
public class BankInfoController extends AbstractController<BankInfo, BankInfoDto, BankInfoService> {

}
