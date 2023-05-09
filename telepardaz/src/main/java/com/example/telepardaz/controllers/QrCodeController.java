package com.example.telepardaz.controllers;

import com.example.telepardaz.dto.QRCodeDto;
import com.example.telepardaz.dto.TransferDto;
import com.example.telepardaz.exceptions.ServiceException;
import com.example.telepardaz.models.QrRCode;
import com.example.telepardaz.services.QrCodeService;
import com.google.zxing.WriterException;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController extends BaseController<QrRCode, QRCodeDto, QrCodeService> {

    @PostMapping(value = "/add",produces = MediaType.IMAGE_PNG_VALUE)
    @Transactional
    public ResponseEntity<BufferedImage> createQrCode(@Valid @RequestBody QRCodeDto dto) throws ServiceException, WriterException {
        return service.okResponse(service.generateQRCodeImage(dto));
    }

    @PostMapping("/transfer")
    @Transactional
    public void transfer(TransferDto transferDto) throws ServiceException  {
        service.transfer(transferDto);
    }


}
